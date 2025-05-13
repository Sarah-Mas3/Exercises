// Necessary libraries for the code to run
import java.io.File;
import java.io.IOException;

// This class handles basic shell-like commands for file system navigation and manipulation

public class ShellCommandHandler {
    private File currentDirectory;

    // Constructor sets the starting directory to the user's current working directory
    public ShellCommandHandler() {
        this.currentDirectory =  new File(System.getProperty("user.dir"));
    }

    // Prints the absolute path of the current directory
    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    // Lists all files and directories in the current directory

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("[DIR]  " + file.getName()); // Print directories with label
                } else {
                    System.out.println("[FILE] " + file.getName()); // Print files with label
                }
            }
        } else {
            System.out.println("Could not list directory contents.");
        }
    }

    // Changes the current directory to the specified subdirectory or parent directory
    public void changeDirectory(String name) {
        if (name == null) {
            System.out.println("Usage: cd [directory_name]");
            return;
        }
        File newDir;
        if (name.equals("..")) {
            newDir = currentDirectory.getParentFile(); // Go to parent directory
        } else {
            newDir = new File(currentDirectory, name); // Go to a subdirectory
        }

        if (newDir != null && newDir.isDirectory()) {
            currentDirectory = newDir; // Change current directory
        } else {
            System.out.println("Directory not found: " + name);
        }
    }

    // Creates a new directory in the current directory
    public void makeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
         if( name == null){
             System.out.println("Usage: mkdir[directory_name] ");
             return;
         }
            if(newDir.exists()){
                System.out.println("Directory already exists");
            }else if(newDir.mkdir()){
                System.out.println("Directory created:" + name);
            }else {
                System.out.println(" Failed to create directory");
            }
    }

    // Creates a new file in the current directory
    public void createFile(String name) {
        if(name == null ){
            System.out.println("Usage: touch [file_name] ");
            return;
        }
        File newFile = new File(currentDirectory, name);
        if (newFile.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + name);
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }

    }

    // Prints a help message listing all available commands
    public void printHelp() {
        System.out.println("Available commands:");
        System.out.println("  pwd               - Print current working directory");
        System.out.println("  ls                - List contents of current directory");
        System.out.println("  cd [dir]          - Change directory");
        System.out.println("  mkdir [name]      - Create a new directory");
        System.out.println("  touch [name]      - Create a new file");
        System.out.println("  help              - Show this help message");
        System.out.println("  exit              - Exit the minishell");
    }

    // Returns the current working directory
    public File getCurrentDirectory() {
        return currentDirectory;
    }
}

