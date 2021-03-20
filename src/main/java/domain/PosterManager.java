package domain;

import lombok.Data;

@Data
public class PosterManager {
    private int maxLastFilm = 10;

    public PosterManager(int maxLastFilm) {
        this.maxLastFilm = maxLastFilm;
    }

    private PurchaseItem[] items = new PurchaseItem[0];

    public void shouldTakeTenFilms(PurchaseItem item) {
        PurchaseItem[] heh = new PurchaseItem[items.length];
        int length= items.length + 1;
        if (length == maxLastFilm) {
            for (int i = 0; i < items.length; i++) {
                heh[i] = items[i];
            }
        }
        else if(length > maxLastFilm){
            for (int i = 0; i < maxLastFilm; i++) {
                heh[i] = items[i];
            }
        }
        else return;
    }


    public void add(PurchaseItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


}

