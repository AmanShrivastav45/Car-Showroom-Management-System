# Car Showroom Management System

A **Java-based CLI application** for managing showrooms, employees, and cars. This application provides functionalities to add and retrieve details of entities interactively. It demonstrates OOP principles like **inheritance**, **interfaces**, and **method overriding**, as well as key Java features like arrays and UUIDs.


## Features  
- Add and display showrooms, employees, and cars.
- User-friendly menu-driven interface.
- Dynamic storage using arrays.
- Uniquely generated employee IDs using UUID.
- Seamless navigation between options.


## Concepts Used  
- **Object-Oriented Programming**:
  - **Inheritance**: `Cars` and `Employees` inherit from the `Showroom` class.
  - **Interface Implementation**: `utility` interface implemented by `Showroom`, `Cars`, and `Employees` classes.
  - **Method Overriding**: `get_details` and `set_details` methods overridden in subclasses.
- **Java Utilities**:
  - **UUID** for generating unique employee IDs.
  - **Scanner** for dynamic input.
- **Control Flow**:
  - Menu-driven program with `while` and `switch` statements.
- **Static Arrays** for storage.
<br></br>
## Sample Output
```yaml
======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================

================================= *** ENTER YOUR CHOICE *** =================================

1] ADD SHOWROOMS                       2] ADD EMPLOYEES                           3] ADD CARS

4] GET SHOWROOMS                       5] GET EMPLOYEES                           6] GET CARS

================================== *** ENTER 0 TO EXIT *** ==================================
ENTER YOUR CHOICE: 1
```
## Adding a Showroom
```yaml
=============================== *** ENTER SHOWROOM DETAILS *** ==============================

ENTER SHOWROOM NAME: AVS Motors
ENTER SHOWROOM MANAGER: Aman Shrivastav
ENTER SHOWROOM LOCATION: M Empire
ENTER SHOWROOM ADDRESS: 123 Marine Street, Mumbai
ENTER TOTAL NO. OF EMPLOYEES: 10
ENTER TOTAL NO. OF CARS IN STOCK: 15
```
## Displaying Showroom Details
```yaml
SHOWROOM NAME: AVS Motors
SHOWROOM MANAGER: Aman Shrivastav
SHOWROOM LOCATION: M Empire
SHOWROOM ADDRESS: 123 Marine Street, Mumbai
TOTAL EMPLOYEES: 10
TOTAL CARS IN STOCK: 15
```
