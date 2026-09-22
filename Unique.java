class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_pile = 0;
        for (int pile : piles) {
            if (max_pile < pile) {
                max_pile = pile;
            }
        }
        for (int k = 1; k <= max_pile; k++) {

            long hours = 0;

            for (int pile : piles) {
                hours += (pile + (long) k - 1) / k;
            }

            if (hours <= h) {
                return k;
            }
        }

        return max_pile;
    }
}
// class Unique {
//     public int firstUniqChar(String s) {
//         int[] freq = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             freq[s.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             if (freq[s.charAt(i) - 'a'] == 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }
