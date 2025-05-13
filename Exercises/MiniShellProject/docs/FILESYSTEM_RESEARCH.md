
# FILESYSTEM_RESEARCH.md

## 1. How to create a directory in Java?
In Java, to create a new directory that wasn't created before, we have to use the `mkdir()` function.
The `mkdir()` function is part of the `File` class (`java.io` package) and the function returns true if the directory is created.

**Java:**

```java
File f = new File("F:\\program"); 
if (f.mkdir()) { 
    System.out.println("Directory is created"); 
} else { 
    System.out.println("Directory cannot be created"); 
}
```

**Source:**  
- https://docs.oracle.com/javase/8/docs/api/java/io/File.html#mkdir--  
- https://www.geeksforgeeks.org/file-mkdir-method-in-java-with-examples/

## 2. How to create a file in Java?
To create a new file that does not exist, use the `createNewFile()` function which is part of the `File` class.
The function returns true if the abstract file path does not exist and a new file is created. It returns false if the filename already exists.

**Java:**

```java
File f = new File("F:\\program.txt");
try {
    if (f.createNewFile()) 
        System.out.println("File created"); 
    else
        System.out.println("File already exists"); 
} catch (Exception e) { 
    System.err.println(e); 
}
```

**Source:**  
- https://www.geeksforgeeks.org/file-createnewfile-method-in-java-with-examples/  
- https://docs.oracle.com/javase/8/docs/api/java/io/File.html#createNewFile--

## 3. How to check if a file or directory exists?
To check if a file or directory exists, use the `exists()` function which is a part of the `File` class.
The function is Boolean and returns true if the file or directory exists (i.e., the path is valid).

**Java:**

```java
File f = new File("F:\\program.txt");
if (f.exists()){
    System.out.println("Exists");
} else {
    System.out.println("Does not Exist");
}
```

**Source:**  
- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/file/Files.html#exists(java.nio.file.Path,java.nio.file.LinkOption...)  
- https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/file/Files.html#exists(java.nio.file.Path,java.nio.file.LinkOption...)

## 4. How to list the contents of a directory?
To list the contents of a directory, use the `listFiles()` method which is part of the `File` class.

The function returns an array of `File` objects denoting the files in a given abstract pathname if the pathname is a directory; else it returns null.

**Java:**

```java
File f = new File("F:\\program");
try {
    File[] files = f.listFiles();
    System.out.println("Files are:");
    for (int i = 0; i < files.length; i++) { 
        System.out.println(files[i].getName()); 
    } 
} catch (Exception e) { 
    System.err.println(e.getMessage()); 
}
```

**Source:**  
- https://www.geeksforgeeks.org/file-listfiles-method-in-java-with-examples/  
- https://docs.oracle.com/javase/8/docs/api/java/io/File.html#listFiles--

## 5. What is the difference between File and Path?
- `File`: Used for basic file system operations (`java.io` package).
- `Path`: Used to operate with more advanced file system features (`java.nio` package).

**Java:**

```java
File file = new File("baeldung/tutorial.txt");
Path path = Paths.get("baeldung/tutorial.txt");
```

**Source:**  
- https://www.baeldung.com/java-path-vs-file  
- https://www.javaguides.net/2023/11/difference-between-path-and-file-in-java-nio.html
