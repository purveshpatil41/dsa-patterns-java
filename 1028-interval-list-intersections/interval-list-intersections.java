class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();

        int Aptr = 0;
        int Bptr = 0;
        int sizeA = firstList.length;
        int sizeB = secondList.length;

        while (Aptr < sizeA && Bptr < sizeB) {
            if (secondList[Bptr][0] <= firstList[Aptr][1] && firstList[Aptr][0] <= secondList[Bptr][1]) {

                res.add(new int[] {
                        Math.max(firstList[Aptr][0], secondList[Bptr][0]),
                        Math.min(firstList[Aptr][1], secondList[Bptr][1])

                });
            }
            if (firstList[Aptr][1] > secondList[Bptr][1])
                Bptr++;
            else
                Aptr++;
        }

        return res.toArray(new int[res.size()][]);
    }
}