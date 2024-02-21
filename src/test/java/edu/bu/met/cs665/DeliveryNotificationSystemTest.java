/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/20/2024
 * File Name: DeliveryNotificationSystemTest.java
 * Description: This test class evaluates the functionality of the delivery notification system
 * designed with the Observer pattern. It covers scenarios such as registering and removing drivers
 * from the shop's notification list, and ensuring delivery requests are correctly broadcast to all
 * registered drivers. The tests leverage Mockito to mock driver objects, facilitating the verification
 * of the system's observer registration, notification dissemination, and observer removal processes
 * without the need for concrete driver implementations. This suite aims to confirm the integrity and
 * reliability of the notification mechanism within a simulated delivery environment.
 */

package edu.bu.met.cs665;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import edu.bu.met.cs665.implementation.DeliveryRequest;
import edu.bu.met.cs665.implementation.Driver;
import edu.bu.met.cs665.implementation.Shop;

public class DeliveryNotificationSystemTest {

    private Shop shop; // Reference to the Shop, acting as the Subject in the Observer pattern.
    private Driver driver1, driver2; // Mocked Driver objects, acting as Observers.
    private DeliveryRequest request; // A sample delivery request used in tests.

    /**
     * Prepares the test environment before each test case runs. This method initializes the shop
     * and creates mock Driver objects and a sample DeliveryRequest to use in the tests, ensuring
     * each test starts with a clean state.
     */
    @Before
    public void setUp() {
        shop = new Shop();
        driver1 = mock(Driver.class);
        driver2 = mock(Driver.class);
        request = new DeliveryRequest("Order #1234: 3x Pizza to 456 Main St");
    }

    /**
     * Tests that drivers are correctly registered as observers to the shop and receive
     * delivery request updates. Verifies that each registered driver receives exactly
     * one update when a delivery request is set.
     */
    @Test
    public void testDriverRegistration() {
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.setDeliveryRequest(request);
        verify(driver1, times(1)).update(request);
        verify(driver2, times(1)).update(request);
    }

    /**
     * Tests that drivers can be successfully removed as observers from the shop and
     * no longer receive delivery request updates after removal.
     */
    @Test
    public void testDriverRemoval() {
        shop.registerObserver(driver1);
        shop.removeObserver(driver1);
        shop.setDeliveryRequest(request);
        verify(driver1, never()).update(request);
    }

    /**
     * Tests that all registered drivers are notified of a new delivery request.
     * This ensures the shop's notifyObservers method correctly broadcasts updates.
     */
    @Test
    public void testNotifyAllDrivers() {
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.setDeliveryRequest(request);
        verify(driver1, times(1)).update(request);
        verify(driver2, times(1)).update(request);
    }

    /**
     * Tests that the delivery request details received by the drivers are correct.
     * This verifies the integrity of the information passed through the notification system.
     */
    @Test
    public void testCorrectDeliveryRequestDetails() {
        shop.registerObserver(driver1);
        shop.setDeliveryRequest(request);
        verify(driver1).update(argThat(requestDetails -> requestDetails.getDetails().equals("Order #1234: 3x Pizza to 456 Main St")));
    }

    /**
     * Tests that a driver no longer receives notifications after being removed from
     * the shop's list of observers, ensuring the removal process functions as expected.
     */
    @Test
    public void testNoNotificationAfterDriverRemoval() {
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.removeObserver(driver1);
        shop.setDeliveryRequest(request);
        verify(driver1, never()).update(request);
        verify(driver2, times(1)).update(request);
    }
}
