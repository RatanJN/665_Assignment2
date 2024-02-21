/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: Subject.java
 * Description: This interface defines the Subject part of the Observer design pattern.
 * It outlines the methods for managing observers in a publish-subscribe model, allowing
 * subjects to register, deregister, and notify observers about state changes or specific
 * events. This interface is crucial for implementing a loosely coupled system where
 * subjects and observers can interact without being tightly bound to each other.
 */

package edu.bu.met.cs665.interfaces;

/**
 * The Subject interface.
 * This interface is designed for objects that act as subjects within the Observer
 * design pattern framework. It provides methods for attaching and detaching observers,
 * as well as notifying them of any state changes or events. Implementing this interface
 * allows for a dynamic and flexible observer management system, where observers can
 * subscribe or unsubscribe from subject notifications as needed.
 */
public interface Subject {
  /**
   * Registers an observer to the subject.
   * This method adds an observer to the subject's list of observers, enabling it to
   * receive updates or notifications about changes or events.
   *
   * @param o The observer to register.
   */
  void registerObserver(Observer o);

  /**
   * Removes an observer from the subject.
   * This method deletes an observer from the subject's list of observers, stopping it
   * from receiving any further updates or notifications.
   *
   * @param o The observer to remove.
   */
  void removeObserver(Observer o);

  /**
   * Notifies all registered observers about a change or event.
   * This method calls the update method on all observers currently registered with
   * the subject, allowing them to respond to the change or event accordingly.
   */
  void notifyObservers();
}
