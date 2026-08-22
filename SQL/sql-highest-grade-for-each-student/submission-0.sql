-- Write your query below
SELECT student_id,exam_id,score
FROM
(
    SELECT student_id,exam_id,score,
    ROW_NUMBER() OVER(
        PARTITION BY student_id
        ORDER BY score DESC, exam_id ASC
    ) rn
    FROM exam_results
)x
WHERE rn=1
ORDER BY student_id;