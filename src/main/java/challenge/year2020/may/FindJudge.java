package challenge.year2020.may;

public class FindJudge {
    /**
     * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
     *
     * If the town judge exists, then:
     *
     * The town judge trusts nobody.
     * Everybody (except for the town judge) trusts the town judge.
     * There is exactly one person that satisfies properties 1 and 2.
     * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
     *
     * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
     *
     * @param N
     * @param trust
     * @return
     */
    public int findJudge(int N, int[][] trust) {
        if (N == 1) return 1;

        int[][] people = new int[N + 1][2];

        for (final int[] item : trust) {
            people[item[0]][0]++;
            people[item[1]][1]++;
        }

        for (int index = 0; index < people.length; index++) {
            if (people[index][0] == 0 && people[index][1] == N -1) {
                return index;
            }
        }

        return -1;
    }

    public int findJudge2(int N, int[][] trust) {
        if (N == 1) return 1;

        int[] people = new int[N + 1];

        for (final int[] item : trust) {
            people[item[0]]--;
            people[item[1]]++;
        }

        for (int index = 0; index < people.length; index++) {
            if (people[index] == N -1) {
                return index;
            }
        }

        return -1;
    }
}
