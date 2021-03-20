package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    void shouldTakeTenFilms() {
PosterManager poster= new PosterManager(5);

        assertEquals(6,poster.getMaxLastFilm());
    }

    @Test
    void add() {
        PosterManager poster= new PosterManager(5);
        assertEquals(6,poster.getMaxLastFilm());
    }
    }
