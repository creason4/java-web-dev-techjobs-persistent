## Part 1: Test it with SQL

SELECT column_name, data_type
FROM information_schema.columns
WHERE table_name = 'job'
ORDER BY ordinal_position;

## Part 2: Test it with SQL

SELECT name
FROM employer
WHERE location="Saint Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL

SELECT DISTINCT name, description
FROM skill
INNER JOIN job_skills ON skills.id=job_skills.skills_id
WHERE jobs_id IS NOT NULL
ORDER BY name;