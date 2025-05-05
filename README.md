# JavaFX MVC Project

This project is a JavaFX application that follows the Model-View-Controller (MVC) architecture. It provides a user management system with CRUD operations, allowing users to register, log in, and manage their profiles.

## Project Structure

```
javafx-mvc-project
├── src
│   ├── controller
│   │   ├── UserController.java
│   │   └── MainController.java
│   ├── model
│   │   └── User.java
│   ├── view
│   │   ├── MainView.fxml
│   │   └── UserView.fxml
│   ├── database
│   │   └── DatabaseConnection.java
│   ├── Main.java
│   └── util
│       └── CrudOperations.java
├── lib
│   └── (place your external libraries here)
├── build.gradle
└── README.md
```

## Features

- **User Registration and Login**: Users can create accounts and log in to the application.
- **User Management**: Users can view and manage their profiles.
- **Database Integration**: The application connects to a MySQL database to store user information.
- **CRUD Operations**: The application supports Create, Read, Update, and Delete operations for user data.

## Setup Instructions

1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd javafx-mvc-project
   ```

2. **Install Dependencies**: 
   Make sure you have Gradle installed. Run the following command to install dependencies:
   ```
   gradle build
   ```

3. **Database Setup**: 
   - Create a MySQL database and a user table with the necessary fields (userId, username, password, userRole).
   - Update the database connection details in `DatabaseConnection.java`.

4. **Run the Application**: 
   Execute the following command to run the application:
   ```
   gradle run
   ```

## Usage

- Launch the application and use the main interface to register or log in.
- Navigate to the user management view to perform actions related to user profiles.

## Contributing

Feel free to fork the repository and submit pull requests for any improvements or features you would like to add.