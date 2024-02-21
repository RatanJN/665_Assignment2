/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Shop.java
 * Description: This class implements the Subject interface as part of the Observer
 * design pattern. It represents a shop in the delivery system, responsible for creating
 * delivery requests and notifying all registered drivers (observers) about these requests.
 * This mechanism allows for a decoupled system where shops can communicate delivery
 * needs without knowing the specifics of each driver.
 */

package edu.bu.met.cs665.implementation;

import edu.bu.met.cs665.interfaces.Observer;
import edu.bu.met.cs665.interfaces.Subject;
import java.util.ArrayList;
import java.util.List;


/**
 * The Shop class.
 * This class models a shop participating in the delivery system. It maintains a list of
 * observers (drivers) and a delivery request. The shop can register or remove observers
 * and notify them about new delivery requests, acting as the subject in the Observer
 * design pattern. This setup allows for dynamic and efficient management of delivery
 * tasks among multiple drivers.
 */
public class Shop implements Subject {
  // A list to keep track of all observers that need to be notified of changes.
  private List<Observer> observers = new ArrayList<>();
    
  // The current delivery request that will be broadcast to all observers.
  private DeliveryRequest deliveryRequest;

  /**
     * Registers an observer to this subject.
     * This method adds a new observer (driver) to the shop's list of observers,
     * enabling the shop to notify this driver about new delivery requests.
     *
     * @param o The observer to be registered.
     */
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  /**
     * Removes an observer from this subject.
     * This method removes an observer (driver) from the shop's list of observers,
     * preventing the shop from notifying this driver about future delivery requests.
     *
     * @param o The observer to be removed.
     */
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  /**
     * Notifies all registered observers about the current delivery request.
     * This method iterates through the shop's list of observers and calls their
     * update method, passing along the current delivery request. This allows
     * drivers to be informed of new delivery opportunities as they arise.
     */
  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(deliveryRequest);
    }
  }

  /**
     * Sets the current delivery request and notifies all observers.
     * This method updates the shop's current delivery request and then
     * immediately notifies all registered observers about this new request,
     * ensuring timely distribution of delivery tasks.
     *
     * @param deliveryRequest The new delivery request to be set.
     */
  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    notifyObservers();
  }
}
