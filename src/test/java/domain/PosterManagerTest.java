package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void shouldTakeMaxFilms() {
        PosterManager manager = new PosterManager();
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        PurchaseItem third = new PurchaseItem(3, 3, "rivay3", 10, 8);
        PurchaseItem fourth = new PurchaseItem(4, 3, "rivay4", 10, 8);
        PurchaseItem fifth = new PurchaseItem(5, 3, "rivay5", 10, 8);
        PurchaseItem sixth = new PurchaseItem(6, 3, "rivay6", 10, 8);
        PurchaseItem seventh = new PurchaseItem(7, 3, "rivay7", 10, 8);
        PurchaseItem eight = new PurchaseItem(8, 3, "rivay8", 10, 8);
        PurchaseItem ninth = new PurchaseItem(9, 3, "rivay9", 10, 8);
        PurchaseItem tenth = new PurchaseItem(10, 3, "rivay10", 10, 8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        PurchaseItem[] actual = manager.shouldTakeMaxFilms();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second,first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldTakeUserFilm() {
        PosterManager manager = new PosterManager(10,3);
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        PurchaseItem third = new PurchaseItem(3, 3, "rivay3", 10, 8);
        PurchaseItem fourth = new PurchaseItem(4, 3, "rivay4", 10, 8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        PurchaseItem[] actual = manager.shouldTakeMaxFilms();
        PurchaseItem[] expected = new PurchaseItem[]{third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    void userSetMoreThanMax() {
        PosterManager manager = new PosterManager(10, 11);
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        PurchaseItem third = new PurchaseItem(3, 3, "rivay3", 10, 8);
        PurchaseItem fourth = new PurchaseItem(4, 3, "rivay4", 10, 8);
        PurchaseItem fifth = new PurchaseItem(5, 3, "rivay5", 10, 8);
        PurchaseItem sixth = new PurchaseItem(6, 3, "rivay6", 10, 8);
        PurchaseItem seventh = new PurchaseItem(7, 3, "rivay7", 10, 8);
        PurchaseItem eight = new PurchaseItem(8, 3, "rivay8", 10, 8);
        PurchaseItem ninth = new PurchaseItem(9, 3, "rivay9", 10, 8);
        PurchaseItem tenth = new PurchaseItem(10, 3, "rivay10", 10, 8);
        PurchaseItem eleventh = new PurchaseItem(11, 3, "rivay11", 10, 8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        PurchaseItem[] actual = manager.shouldTakeMaxFilms();
        PurchaseItem[] expected = new PurchaseItem[]{eleventh, tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
    @Test
    void userSetMax() {
        PosterManager manager = new PosterManager(10, 10);
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        PurchaseItem third = new PurchaseItem(3, 3, "rivay3", 10, 8);
        PurchaseItem fourth = new PurchaseItem(4, 3, "rivay4", 10, 8);
        PurchaseItem fifth = new PurchaseItem(5, 3, "rivay5", 10, 8);
        PurchaseItem sixth = new PurchaseItem(6, 3, "rivay6", 10, 8);
        PurchaseItem seventh = new PurchaseItem(7, 3, "rivay7", 10, 8);
        PurchaseItem eight = new PurchaseItem(8, 3, "rivay8", 10, 8);
        PurchaseItem ninth = new PurchaseItem(9, 3, "rivay9", 10, 8);
        PurchaseItem tenth = new PurchaseItem(10, 3, "rivay10", 10, 8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
        PurchaseItem[] actual = manager.shouldTakeMaxFilms();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void add() {
        PosterManager manager = new PosterManager();
        PurchaseItem first = new PurchaseItem(1, 3, "rivay", 10, 8);
        PurchaseItem second = new PurchaseItem(2, 3, "rivay2", 10, 8);
        manager.add(first);
        manager.add(second);
        PurchaseItem[] expected = new PurchaseItem[]{first, second};
        assertArrayEquals(expected, manager.getItems());
    }

    @Test
    public void shouldChangeId() {
        PurchaseItem manager = new PurchaseItem();
        assertEquals(0, manager.getId());
        manager.setId(5);
        assertEquals(5, manager.getId());
    }
    @Test
    public void shouldChangeProductId() {
        PurchaseItem manager = new PurchaseItem();
        assertEquals(0, manager.getProductId());
        manager.setProductId(4);
        assertEquals(4, manager.getProductId());
    }
    @Test
    public void shouldChangeProductName() {
        PurchaseItem manager = new PurchaseItem();
        assertEquals(null, manager.getProductName());
        manager.setProductName("Kavaki");
        assertEquals("Kavaki", manager.getProductName());
    }
    @Test
    public void shouldChangeProductPrice() {
        PurchaseItem manager = new PurchaseItem();
        assertEquals(0, manager.getProductPrice());
        manager.setProductPrice(100);
        assertEquals(100, manager.getProductPrice());
    }
    @Test
    public void shouldChangeCount() {
        PurchaseItem manager = new PurchaseItem();
        assertEquals(0, manager.getCount());
        manager.setCount(100);
        assertEquals(100, manager.getCount());
    }
}