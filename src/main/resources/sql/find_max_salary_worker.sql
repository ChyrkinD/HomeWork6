SELECT worker.name,worker.salary FROM worker
WHERE salary = (SELECT MAX(salary) FROM worker);