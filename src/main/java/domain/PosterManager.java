package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosterManager {
    private int maxLastFilm = 10;
    private int userSetFilm;

    public PosterManager(int maxLastFilm) {
        this.maxLastFilm = maxLastFilm;
    }

    private PurchaseItem[] items = new PurchaseItem[0];

    public PurchaseItem[] shouldTakeMaxFilms() {
        int tempLength = items.length;
        if (userSetFilm > 0) {
            userSetFilm = tempLength;
        } else {
            maxLastFilm = tempLength;
        }
        PurchaseItem[] result = new PurchaseItem[tempLength];
        for (int i = 0; i < userSetFilm; i++) {
            int index = result.length - i - 1;
            result[i] = items[index];
        }
            return result;


    }


    public void add(PurchaseItem item) {
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


}



