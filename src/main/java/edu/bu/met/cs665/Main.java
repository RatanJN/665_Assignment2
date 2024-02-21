/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Main.java
 * Description: This class serves as the main entry point for the demonstration of a delivery
 * notification system utilizing the Observer design pattern. It simulates a scenario where a
 * shop issues a delivery request, and all registered drivers are notified. This example
 * illustrates how shops and drivers can interact in a loosely coupled manner, showcasing
 * the flexibility and scalability of the design.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.implementation.DeliveryRequest;
import edu.bu.met.cs665.implementation.Driver;
import edu.bu.met.cs665.implementation.Shop;

/**
 * The Main class.
 * This class is designed to demonstrate the Observer design pattern within a simple delivery
 * system. It creates a shop, several drivers, and a delivery request, then shows how the shop
 * can notify all drivers about the delivery request using the pattern. This simulation highlights
 * the decoupling of the shop's notification mechanism from the drivers' response mechanism.
 */
public class Main {

  /**
     * The main method.
     * This is the entry point of the application. It sets up the environment by creating a shop,
     * multiple drivers, and a delivery request. It demonstrates the registration of drivers with
     * the shop, the creation of a delivery request, and the notification of all registered drivers
     * about the request. This method exemplifies the use of the Observer design pattern in a
     * practical application scenario.
     *
     * @param args Command line arguments (not used).
     */
  public static void main(String[] args) {
    // Instantiate a new Shop object which will act as the subject.
    Shop shop = new Shop();

    // Creating and initializing five Driver objects to act as observers.
    Driver driver1 = new Driver("Driver 1");
    Driver driver2 = new Driver("Driver 2");
    Driver driver3 = new Driver("Driver 3");
    Driver driver4 = new Driver("Driver 4");
    Driver driver5 = new Driver("Driver 5");

    // Registering the Driver objects with the Shop so they can receive updates.
    shop.registerObserver(driver1);
    shop.registerObserver(driver2);
    shop.registerObserver(driver3);
    shop.registerObserver(driver4);
    shop.registerObserver(driver5);

    // Creating a new DeliveryRequest object and using it to notify all registered drivers.
    DeliveryRequest request = new DeliveryRequest("Order #1234: 3x Pizza to 456 Main St");
    shop.setDeliveryRequest(request);
  }
}
