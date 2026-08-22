# Write your MySQL query statement below
select e.name from employee e join employee s on e.id=s.managerId group by  
s.managerId having count(s.managerId)>=5