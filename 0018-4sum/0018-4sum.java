class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> r = new ArrayList<>();
        int n = a.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                int l = j + 1, h = n - 1;
                while (l < h) {
                    long s = (long)a[i] + a[j] + a[l] + a[h];

                    if (s == t) {
                        r.add(Arrays.asList(a[i], a[j], a[l], a[h]));
                        while (l < h && a[l] == a[l + 1]) l++;
                        while (l < h && a[h] == a[h - 1]) h--;
                        l++; h--;
                    } else if (s < t) l++;
                    else h--;
                }
            }
        }
        return r;
    }
}