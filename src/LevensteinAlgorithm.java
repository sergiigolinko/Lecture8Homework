public class LevensteinAlgorithm {
    public String s1;
    public String s2;

    public LevensteinAlgorithm(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int findDistanceAlgorithm() {
        boolean caseSensitive = false;
        //нехтуємо регістром символів
        if (!caseSensitive) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
        }
        //ініціалізуємо довжини рядків
        int m = s1.length();
        int n = s2.length();
        //матриця, яка зберігатиме число змін, необхідних для перетворення одного рдка в інший
        int[][] deltaM = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            deltaM[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            deltaM[0][j] = j;
        }
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    deltaM[i][j] = deltaM[i - 1][j - 1];
                } else {
                    deltaM[i][j] = Math.min(deltaM[i - 1][j] + 1, Math.min(deltaM[i][j - 1] + 1, deltaM[i - 1][j - 1] + 1));
                }

            }

        }
        return deltaM[m][n];
    }

    @Override
    public String toString() {
        return "LevensteinAlgorithm{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LevensteinAlgorithm that = (LevensteinAlgorithm) o;

        if (s1 != null ? !s1.equals(that.s1) : that.s1 != null) return false;
        return s2 != null ? s2.equals(that.s2) : that.s2 == null;
    }


}
