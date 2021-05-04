package domain;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class PosterManager {
    private int maxLastFilm = 10;
    private int userSetFilm;
    private PurchaseItem[] items = new PurchaseItem[0];

    public PosterManager(int userSetFilm) {
        this.userSetFilm = userSetFilm;
    }


    public PurchaseItem[] getItems() {
        return items;
    }


    public PurchaseItem[] shouldTakeMaxFilms() {
        int tempLength = items.length;
        if (userSetFilm > 0 && userSetFilm < items.length) {
            tempLength = userSetFilm;
        } else if (userSetFilm > 0 && userSetFilm >= items.length) {
            tempLength = items.length;
        } else if (userSetFilm <= 0 && maxLastFilm > items.length) {
            tempLength = items.length;
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



