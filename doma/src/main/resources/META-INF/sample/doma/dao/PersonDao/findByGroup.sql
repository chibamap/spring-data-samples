select
  /*%expand*/*
from
  person
where
  group_id in (
    select id from groups where
    /*%if group.id != null */
    and `id` = /* group.id */'hoge'
    /*%end */
    /*%if group.name != null */
    and `name` = /* group.name */'hoge'
    /*%end */
  )
