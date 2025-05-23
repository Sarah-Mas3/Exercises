# Minishell - Java-based Command Line Interface

## Project Description:

Minishell is a simple Java-based command-line shell called Minishell.
It allows users to interact with the file system using basic commands such as:
- `pwd`: display the current working directory
- `ls`: list the contents of the current directory
- `cd`: change the working directory
- `mkdir`: create a new directory
- `touch`: create a new file
- `help`: show a list of available commands
- `exit`: exit the shell

The project is designed for educational purposes and demonstrates important programming concepts in Java, including:
- File and directory handling using the `java.io.File` class.
- Reading user input with `Scanner`.
- Command parsing and control flow.
- Object-oriented design through separation of logic into different classes (`Minishell` and `ShellCommandHandler`).

The user interacts with the shell through a loop that takes input, processes the command, and executes the appropriate file system action.

## Instructions: How to Compile and Run the Code:

1.  Install IntelliJ IDEA (recommended).
2.  Create a new Java project or open the folder containing `Minishell.java` and `ShellCommandHandler.java`. Make sure both files are inside the `src` folder.
3.  Go to `File` -> `Project Structure...` -> `Project`, and ensure a valid JDK is selected.
4.  Click `+` -> `Build Project`.
5.  To compile, right-click on `Minishell.java` -> `Run 'Minishell.main()'`.
6.  A shell prompt will appear. Start typing commands! To run the code: You run with Java Minishell. You will then see the shell prompt, and you can start typing commands like `pwd`, `ls`, `mkdir`, `exit`.

## Example of Running the Commands:

Here is an example of how Minishell works after running the program:

```
C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.5\jbr\bin\java ... Minishell
Welcome to Minishell! Type 'help' for a list of commands.
Minishell> mkdir MyFile
Directory created: MyFile
Minishell> cd MyFile
Current working directory is: C:\Users\Asus\IdeaProjects\test\MyFile
Minishell> touch MyFile.txt
File created: MyFile.txt
Minishell> ls
MyFile.txt  MyFile
Current working directory is - List contents of current directory cd [dir] - Change directory mkdir [name] - Create a new directory touch [name] - Create a new file help - Show this help message exit - Exit the minishell
Minishell> exit
Goodbye! Process finished with exit code 0
```

## Commands in Code Explaining Each Method:

Each method in `ShellCommandHandler` file includes the following methods:
- `printWorkingDirectory()` - Prints the current path.
- `listDirectory()` - Lists files and directories individually.
- `changeDirectory(String name)` - navigates between directories.
- `makeDirectory(String name)` - creates a new directory.
- `createFile(String name)` - creates a new file.
- `printHelp()` - shows all supported commands.
- `getCurrentDirectory()` - returns the current directory as a File object.

Each method is documented with comments explaining its purpose and usage directly in the code.
```
