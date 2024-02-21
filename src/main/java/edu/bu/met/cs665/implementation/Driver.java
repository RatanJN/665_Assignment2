/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Driver.java
 * Description: This class implements the Observer interface as part of the Observer
 * design pattern. It represents a driver in the delivery system, capable of receiving
 * updates about new delivery requests. Each driver object is an observer that gets
 * notified whenever there is a new delivery request, allowing for dynamic dispatch
 * of delivery tasks among multiple drivers.
 */

package edu.bu.met.cs665.implementation;

import edu.bu.met.cs665.interfaces.Observer;

/**
 * The Driver class.
 * This class models a driver who participates in the delivery system. It is designed
 * to receive notifications about new delivery requests, implementing the Observer
 * interface. Each driver has a unique name and can handle delivery requests as they
 * come in. This allows for a flexible and scalable way to manage delivery tasks across
 * a pool of drivers.
 */
public class Driver implements Observer {
  // Name of the driver, used for identification and notifications.
  private String name;

  /**
   * Constructs a new Driver instance with the specified name.
   * This constructor initializes a driver with a unique name, preparing it to receive
   * and respond to delivery requests.
   *
   * @param name The name of the driver.
   */
  public Driver(String name) {
    this.name = name;
  }

  /**
   * Receives and processes new delivery requests.
   * This method is called whenever the driver, as an observer, is notified of a new
   * delivery request by a subject. It prints out a message indicating that the driver
   * has received the new delivery request, including the request's details.
   *
   * @param deliveryRequest The new delivery request being notified.
   */
  @Override
  public void update(DeliveryRequest deliveryRequest) {
    System.out.println(name + " received a new delivery request: " + deliveryRequest.getDetails());
  }
}
