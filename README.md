# OOP_PaymentApplication

Welcome to the OOP Payment Application repository! This application allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application calculates the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the `totalAmount` attribute of the Order class.

## Overview

### PaymentApp Class

The `PaymentApp` class serves as the entry point for the application. It demonstrates how to create an `Order` object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.

### Order Class

The application includes an `Order` class that stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (`totalAmount`).

### PaymentMode Interface

The application implements a `PaymentMode` interface that defines a method for calculating the discount offered by the payment method.

### PaymentMode Implementations

- **GCash**: Does not offer any discount (discount rate = 0.0).
- **Maya**: Offers a 5% discount (discount rate = 0.05).
- **ShopeePay**: Offers a 10% discount (discount rate = 0.1).
