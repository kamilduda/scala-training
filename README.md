# scala-training

### Practical examples and exercises for Programming in Scal training
1. [Hello World (Scala)](/hello-world)
2. [Language Basics](/language-basics)
3. [Intermediate Scala](/intermediate)

### Solutions
* Projects contain excercises in form of tests that you need to pass.
* If you run into some problems be sure to check the ["solutions" branch](https://github.com/kamilduda/scala-training/branches) in this repository where all the tasks are completed.

### How to open a project?
1. Clone this repository. The repository contains projects - one for each "chapter" of the training.
2. **DO NOT USE "IMPORT PROJECT" INTELLIJ OPTION!** This will create a new .idea folder (containing shared IntelliJ's run configrations) and override the existing configuration. Instead please use "Open" option on a specific project from this repository (e.g. `language-basics` or `hello-world`)
3. IntelliJ may want you to specify Java JDK and Scala SDK, if so, do it.
4. Sometimes you will also need to force SBT to compile the project before running examples. To do so open `SBT Shell` from to bottom of IntelliJ's toolbar and just run `compile` command.
