**Other language: [Chinese](https://github.com/bipy/Sort-Algorithm-Comparison/blob/master/README_CN.md)**

# About this repositories

Time cost comparison among various sort algorithm written by Java. Once I have done this before, but I thought that didn't satisfy me afterwards. The previous version has lots of problems (this one as well : )

I rewrite those codes using Java, this one doesn't count on Online Judge to do the job. It uses 7 sort algorithms and 7 typical integer arrays to do the test.

You could clone this repo to change some thing and have fun.

Also welcome to pull request~

# Blog

**language: CN**

[排序算法的比较 (Java)](https://bipy.github.io/blog/Sort-Algorithm-Comparison/)

# Feature

- Compared 7 sort algorithm include Randomized Quick Sort, Quick Sort, Heap Sort, Merge Sort, Bubble Sort, Insertion Sort, and java.util.Arrays.sort()
- United API by extends class SortAlgorithm and override run()
- ordered array step distance control, unordered array shuffle algorithm
- hands-free

# Build

**IntelliJ IDEA**

1. Open this folder.

2. **Project Explorer** 

    Found **src**  

    then turn to **right-click menu** --> 

    **Mark Directory as** -->  

    **Sources Root**.

3. Make a new directory named **'out'** as **'/Sort-Algorithm-Comparison/out'**.

4. Turn to **Project Structure** (Ctrl + Alt + Shift + S) --> 

    **Project Compiler Output** -->

    '**/Sort-Algorithm-Comparison/out**'  (directory 'out' just created at step 3).

5. **Run** (Alt + Shift + F10)

 

# Description

Test case information as followings:

- Case 0: 1 random element, range [0,1000)
- Case 1: 11 random elements, range [0,1000)
- Case 2: 10^5 random elements, range [0,1000)
- Case 3: 10^5 random elements, range [-10^4,10^4)
- Case 4: 10^5 forward sequence, Initial value -5×10^4, increase step distance range [0,5)，Mathematical expectation 1
- Case 5: 10^5 backward sequence, Initial value 5×10^4, decrease step distance range [0,5)，Mathematical expectation 1
- Case 6: 10^5 mostly ordered sequence, get forward sequence, Let rate be unordered, randomly shuffle N×unordered elements among sequence

# Summary

## Output

```text
    0     0     0     0     0     0     0     0 
    1     0     0     0     0     0     0     0 
    2    27    25    19    32 15186   872    10 
    3     8     8    12    11 14810   878    13 
    4     4     -    10     5     0     0     2 
    5     4     -     9     5  5836  1728     2 
    6     4    11    11     4  2382    53    26 

Process finished with exit code 0

```

## Statistics (ms)

| Test Case \ Algorithm                            | Randomized Quick | Quick | Heap | Merge | Bubble | Insertion | Arrays.sort() |
| :----------------------------------------------- | :--------------- | :---- | :--- | :---- | :----- | :-------- | ------------- |
| Case 0: 1 random element, range [0,1000)         | 0                | 0     | 0    | 0     | 0      | 0         | 0             |
| Case 1: 11 random elements, range [0,1000)       | 0                | 0     | 0    | 0     | 0      | 0         | 0             |
| Case 2: 10^5 random elements, range [0,1000)     | 27               | 25    | 19   | 32    | 15186  | 872       | 10            |
| Case 3: 10^5 random elements, range [-10^4,10^4) | 8                | 8     | 12   | 11    | 14810  | 878       | 13            |
| Case 4: 10^5 forward sequence                    | 4                | -     | 10   | 5     | 0      | 0         | 2             |
| Case 5: 10^5 backward sequence                   | 4                | -     | 9    | 5     | 5836   | 1728      | 2             |
| Case 6: 10^5 mostly ordered sequence             | 4                | 11    | 11   | 4     | 2382   | 53        | 26            |