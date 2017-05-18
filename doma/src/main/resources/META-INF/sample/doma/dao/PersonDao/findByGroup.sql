select
  /*%expand*/*
from
  person
where
  group_id in (select id from groups where `name` = /* groupName */'hoge')
