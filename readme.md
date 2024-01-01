# Warning this project is fairly new, but should be mostly stable now, use at your own risk

if something goes wrong try to delete your gradle cache, also for 1.12 currently forge mixins do not work, this may have to wait on unimixins.

## LegacyModding Example Mod
***
this is a example mod for both fabric and forge for 1.12.2 but its easy to strip out what you want, based on FDD-XPlat

This project is a Gradle template that allows you to build Forge/Fabric mods for 1.12.2 using shared code.

This project is powered by [Unimined](https://github.com/unimined/unimined).

***

### Using this template

1) Clone, download the project to your computer, or generate a new repository from this template
1) Open up `settings.gradle` and replace `rootProject.name = 'LegacyModdingExampleMod'` with the name of your project
1) Open up `gradle.properties` and replace the following values:
   1) `mod_author` -> Your name
   1) `mod_id` -> The id of your mod. For example: `myawesomemod`
   1) `mod_name` -> The name of your mod. This will be used for the output jars
   1) `minecraft_version` -> The minecraft version your project targets
   1) `fabric_loader` -> The fabric loader version to use. Find this [here](https://grayray75.github.io/LegacyFabric-Versions/)
   1) `fabric_api` -> The Fabric API for your minecraft version. Find this [here](https://grayray75.github.io/LegacyFabric-Versions/)
   1) `forge_version` -> The Forge version for your Minecraft version to use

1) If your default JVM/JDK is not Java 8 you will encounter an error when opening the project. This error is fixed by going to File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVMand changing the value to a valid Java 8 JVM. You will also need to set the Project SDK to Java 8. This can be done by going to File > Project Structure > Project SDK. Once both have been set open the Gradle tab in IDEA and click the refresh button to reload the project.
1) Replace the contents of `LICENSE` with your mod license
1) Replace the contents of `readme.md` with your mod readme

### Importing into IntelliJ Idea

`File > Open` selent the build.gradle, it should just work, you should see an elephant icon with gradle text on the right, your gradle tasks are there.

I also highly recommend the [MCDEV](https://mcdev.io/) plugin.

### Importing into VSCode/VSCodium

Install these plugins
1) [Language Support for Java](https://marketplace.visualstudio.com/items?itemName=redhat.java)
1) [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)
1) [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
1) [Gradle for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-gradle)
1) [EditorConfig for VS Code](https://marketplace.visualstudio.com/items?itemName=EditorConfig.EditorConfig)

`File > Open Folder` select the project folder, you should see an elephant icon, your gradle tasks are there.

### Importing into Eclipse

`File > Import... > Existing Gradle Project` select the folder, you should see an elephant icon with gradle text on the bottom, your gradle tasks are there.

### Running in dev

Run the `Fabric > unimined_runs > runClient` task for the Fabric client for example, `Forge > unimined_runs > runServer` for the forge server.

### Removing a subproject

If you want forge only, or fabric only, just delete said folder, and remove the include at the bottom of settings.gradle

***

### Development Guide

When using this template the majority of your mod is developed in the Common project. The Common project is compiled against the vanilla game and is used to hold code that is shared between the different loader-specific versions of your mod. The Common project has no knowledge or access to ModLoader specific code, apis, or concepts. Code that requires something from a specific loader must be done through the project that is specific to that loader, such as the Forge or Fabric project.

Loader specific projects such as the Forge and Fabric project are used to load the Common project into the game. These projects also define code that is specific to that loader. Loader specific projects can access all of the code in the Common project. It is important to remember that the Common project can not access code from loader specific projects.

***

### License

This template is licensed under CC0-1.0 license. You can use your own license for the mods you make using this project