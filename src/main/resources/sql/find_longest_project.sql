SELECT p.id, EXTRACT(MONTH FROM AGE(finish_date, start_date)) AS month FROM project p
WHERE finish_date notnull
GROUP BY p.id
ORDER BY month DESC
Limit 1;




