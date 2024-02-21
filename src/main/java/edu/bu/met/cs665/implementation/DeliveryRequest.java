/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for the representation and management
 * of delivery requests within the delivery system. It encapsulates the essential
 * details of a delivery request, such as the items to be delivered and the
 * destination address, providing a structured way to handle delivery information.
 */

package edu.bu.met.cs665.implementation;

/**
 * This is the DeliveryRequest class.
 * This class is responsible for representing a delivery request in the delivery system.
 * It encapsulates the details of a delivery request, such as the items to be delivered
 * and the destination address.
 */
public class DeliveryRequest {
  // The details of the delivery request, including items and destination
  private String details;

  /**
   * Constructs a new DeliveryRequest instance with specified details.
   * This constructor initializes the delivery request with information about
   * what needs to be delivered and where.
   *
   * @param details A string representing the details of the delivery request,
   *                such as the items to be delivered and the destination address.
   */
  public DeliveryRequest(String details) {
    this.details = details;
  }

  /**
   * Getter method for the details of the delivery request.
   *
   *@return The details of the delivery request as a string.
   */
  public String getDetails() {
    return details;
  }
}
