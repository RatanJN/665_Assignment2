/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Observer.java
 * Description: This interface defines the Observer part of the Observer design pattern.
 * It is intended for objects that need to be notified about changes in the state of
 * another object, specifically for receiving updates about new delivery requests in the
 * delivery system. Implementing classes will define the update method to handle the
 * reception of new delivery requests.
 */

package edu.bu.met.cs665.interfaces;

import edu.bu.met.cs665.implementation.DeliveryRequest;

/**
 * The Observer interface.
 * This interface is used by objects that should be notified of changes, specifically
 * for receiving updates about new delivery requests. It is a key component of the
 * Observer design pattern, facilitating a loosely coupled design where objects interact
 * by observing state changes rather than direct method calls.
 */
public interface Observer {
  /**
   * Updates the observer with a new delivery request.
   * This method is called when the subject (typically a Shop or Delivery Service)
   * has a new delivery request to notify its observers about.
   *
   * @param deliveryRequest The new delivery request to be handled by the observer.
   */
  void update(DeliveryRequest deliveryRequest);
}
