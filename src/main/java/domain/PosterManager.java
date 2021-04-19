package domain;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class PosterManager {
    private int maxLastFilm = 10;
    private int userSetFilm;

    public PosterManager(int maxLastFilm, int userSetFilm) {
        this.maxLastFilm = maxLastFilm;
        this.userSetFilm = userSetFilm;
    }


    private PurchaseItem[] items = new PurchaseItem[0];

    public PurchaseItem[] getItems() {
        return items;
    }


    public PurchaseItem[] shouldTakeMaxFilms() {
        int tempLength = items.length;
        if (userSetFilm > 0) {
            tempLength = userSetFilm;
        } else {
            tempLength = maxLastFilm;
        }
        PurchaseItem[] result = new PurchaseItem[tempLength];
        for (int i = 0; i < tempLength; i++) {
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



