import org.example.Solution6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

/**
 * 测试用例设计原则：
 * 1. 等价类划分：根据输入公司清单长度和子集关系，将输入数据分为有效的子集和非子集类。
 * 2. 边界值分析：测试最少和最多的公司数量的清单。
 */
public class L2022211826_6_Test {

    /**
     * 测试目的：测试包含子集的基本用例
     * 测试用例：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
     * 预期结果：返回 [0,1,4]，因为其他的清单都是某些人的子集。
     */
    @Test
    public void testPeopleIndexes_case1() {
        Solution6 solution = new Solution6();
        List<List<String>> favoriteCompanies = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("google", "microsoft"),
            Arrays.asList("google", "facebook"),
            Arrays.asList("google"),
            Arrays.asList("amazon")
        );
        List<Integer> expected = Arrays.asList(0, 1, 4);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    /**
     * 测试目的：测试没有子集的情况
     * 测试用例：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
     * 预期结果：返回 [0, 1, 2, 3]，因为没有任何公司清单是子集。
     */
    @Test
    public void testPeopleIndexes_case2() {
        Solution6 solution = new Solution6();
        List<List<String>> favoriteCompanies = Arrays.asList(
            Arrays.asList("leetcode"),
            Arrays.asList("google"),
            Arrays.asList("facebook"),
            Arrays.asList("amazon")
        );
        List<Integer> expected = Arrays.asList(0, 1, 2, 3);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }
}
