package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void shouldTakeMaxFilms() {
        PosterManager manager = new PosterManager(5);
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        PurchaseItem third = new PurchaseItem(3, 3, "rivay3", 10, 8);
        PurchaseItem fourth = new PurchaseItem(4, 3, "rivay4", 10, 8);
        PurchaseItem fifth = new PurchaseItem(5, 3, "rivay5", 10, 8);
        PurchaseItem sixth = new PurchaseItem(6, 3, "rivay6", 10, 8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        PurchaseItem[] actual = manager.shouldTakeMaxFilms();
        PurchaseItem[] expected = new PurchaseItem[]{first, second, third,fourth, fifth};
        assertArrayEquals(expected, actual);
    }


    @Test
    void add(PurchaseItem item) {
        PosterManager manager = new PosterManager(5);
        PurchaseItem once = new PurchaseItem(1, 3, "rivay", 10, 8);
        manager.add(once);
        PurchaseItem[] actual = manager.add(once);
        PurchaseItem[] expected = new PurchaseItem[]{once};
        assertArrayEquals(expected,actual);
    }
}