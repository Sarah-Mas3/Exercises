import java.util.Scanner;

public class MiniShell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShellCommandHandler handler = new ShellCommandHandler();

        System.out.println("Welcome to MiniShell! Type 'help' for a list of commands.");

        while (true) {
            System.out.print(handler.getCurrentDirectory().getAbsolutePath() + " > ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(" ", 2);
            String command = parts[0];
            String argument = parts.length > 1 ? parts[1] : null;

            switch (command) {
                case "pwd" -> handler.printWorkingDirectory();
                case "ls" -> handler.listDirectory();
                case "cd" -> handler.changeDirectory(argument);
                case "mkdir" -> handler.makeDirectory(argument);
                case "touch" -> handler.createFile(argument);
                case "help" -> handler.printHelp();
                default -> {
                    System.out.println("Unknown command: " + command);
                    System.out.println("Type 'help' for a list of commands.");
                }
            }

            if (command.equals("exit")) {
                System.out.println("Goodbye!");
                return;
            }
        }
    }
}