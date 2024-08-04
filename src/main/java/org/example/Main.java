package org.example;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
/*
*    Задача
* - Дан массив строк, необходимо удалить из него все дубли
*   , оставшиеся строки объединить в одну в порядке следования в массиве.
*/

    public static void main(String[] args){
        String[] strings = {"строка1", "строка1","строка1",
                "строка2","строка7","строка3",
                "строка2","строка7","строка4",
                "строка3","строка7","строка4",
        };

        Set<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < strings.length; i++) {
            set.add(strings[i]);
        }

        strings = set.toArray(new String[set.size()]);

        System.out.println(Arrays.toString(strings));
    }
}
