package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PosterManager {
    private int maxLastFilm = 10;

    public PosterManager(int maxLastFilm) {
        this.maxLastFilm = maxLastFilm;
    }

    private PurchaseItem[] items = new PurchaseItem[0];

    public PurchaseItem[] shouldTakeMaxFilms() {
        int length = items.length + 1;
        PurchaseItem[] heh = new PurchaseItem[length];
        if (length <= maxLastFilm) {
            for (int i = 0; 1 < heh.length; i++) {
                int index = items.length - i - 1;
                heh[i] = items[index];
            }
            return heh;
        } else for (int i = 0; i < maxLastFilm; i++) {
            int index = items.length - i - 1;
            heh[i] = items[i];
        }
        return heh;
    }


    public PurchaseItem[] add(PurchaseItem item) {
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
        return tmp;
    }


}



