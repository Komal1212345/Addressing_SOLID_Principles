# Addressing_SOLID_Principles

# Documentation:

# Use Case: Online Shopping Platform
# Description:
Consider an online shopping platform where users can browse products, add them to their cart, and place orders. The platform offers various discounts based on product types and order totals. Users need to authenticate themselves before making a purchase.

# Scenerio: 
# Single Responsibility Principle (SRP):
The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one responsibility. 
In the Violated Folder, the "UserAuthenticationAndOrderProcessing" class violates SRP as it handles both user authentication and order processing functionalities within a single class. This violates SRP because the class has multiple reasons to change - if either the user authentication logic or the order processing logic needs to be modified, the class would need to be altered.
In the Solved Folder, the violation is addressed by splitting the responsibilities into separate classes: "UserAuthentication" and "OrderProcessing". Now, each class has a single responsibility - one for user authentication and the other for order processing. This adheres to SRP, making the code more maintainable and easier to understand. Each class is now focused on a single task, reducing the chances of unintended side effects when making changes.

# Open/Closed Principle (OCP):
The Open/Closed Principle (OCP) states that classes should be open for extension but closed for modification.
In the Violated Folder, the "DiscountCalculator" class violates OCP because it needs to be modified whenever a new type of discount needs to be added. This violates OCP because the class is not closed for modification - adding new discount types requires changing the existing code.
In the Solved Folder, the violation is addressed by applying the strategy pattern. The "DiscountCalculator" class is refactored into an interface "DiscountStrategy" and concrete implementations "PercentageDiscountStrategy" and "FixedDiscountStrategy". Now, when a new discount type needs to be added, a new class implementing the DiscountStrategy interface can be created without modifying the existing code. This adheres to OCP because the class is closed for modification but open for extension, allowing new discount strategies to be added without altering existing code.

# Liskov Substitution Principle (LSP):
The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of its subclass without affecting the correctness of the program. 
In the Violated Folder, the "Square" class violates LSP by inheriting from the "Rectangle" class. This violates LSP because a Square cannot always be substituted for a Rectangle without introducing unexpected behavior, especially regarding setting different widths and heights.
In the Solved Folder, the violation is addressed by redesigning the class hierarchy. Instead of "Square" inheriting from "Rectangle", both classes implement a common interface "Shape". Now, a Square can be substituted for a Rectangle without affecting the correctness of the program, as both classes adhere to the contract specified by the Shape interface. This ensures that objects of subclasses can be used interchangeably with objects of their superclass, satisfying LSP.
