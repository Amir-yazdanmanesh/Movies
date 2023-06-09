# Movies Application

This is an Android app that allows users to view a list of movies and search for movies. It was built using the Model-View-Intent (MVI) pattern, coroutines for asynchronous programming, clean architecture for code organization, navigation components for navigating between screens, Dagger 2 for dependency injection, Kotlin DSL for Gradle configuration, Epoxy for building complex RecyclerViews, Retrofit for network communication, data binding for connecting UI components to data sources, and includes both unit and instrumented tests.



## Project Structure

The project is organized in several modules that follow Clean Architecture principles.

- **app**: Main application module where the project starts from.
  buildSrc: Contains common classes used across modules and build configuration.

- **core**: Contains the core functionality of the app, including navigation, dependency injection and utility classes.

- **data**: Contains the data layer of the app, including network and repository implementations.

- **domain**: Contains the domain layer of the app, including business logic and data models.

- **features**: Contains different feature modules of the app. In this project, there is a movies feature module which uses MVI MVVM Redux architecture.

## Technology Stack

- The project uses the following technologies:

- Kotlin DSL for build configuration.

- Dagger 2 for dependency injection.

- Coroutines for asynchronous programming.

- Navigation Components for app navigation.

- Epoxy for building complex RecyclerViews.

- Retrofit for network requests.

- Data Binding for view binding.

- Unit tests for testing business logic and other components.

- Instrumented tests for testing app functionality on a device or emulator.


The specific dependencies for each module can be found in their respective build.gradle files.

## Testing
This project includes unit tests for the **`Movies`** module and **`repository-impl`**, as well as instrumented tests in the **`App`** module. The unit tests were written using Mockito and Mockk, and the instrumented tests were written using Espresso and JUnit 4. These tests help ensure the reliability and stability of the app, and demonstrate good coding practices.

## Installation
Clone the repository and open the project in Android Studio. Gradle will automatically download the necessary dependencies.

To run the project, you can either build and install the APK on a device or emulator, or run the **`app`** from Android Studio by selecting the **`app`** module and running the app configuration.

To run the unit tests, select the module and run the **`test`** configuration. To run instrumented tests, select the **`androidTest`** directory and run the **`connectedAndroidTest`** configuration.

## Contributing

Please feel free to contribute to this project by submitting pull requests or opening issues.

## Screenshot

<img src="/photo/screenshot.jpg" alt="Screenshot of the app" width="300">

## Use Case Diagram

![Use Case Diagram](/photo/app_diagram.png "Use Case Diagram")
