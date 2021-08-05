Q1.  select u.user_id, u.address , t.total_invoice_amount, t.invoice_amount_paid, t.remedo_commission from users u join transactions t ON u.user_id = t.user_id where u.user_id = 'u1';

Q2.  select SUM(remedo_commission) from transactions where user_id = 'u1' group by (user_id);

Q3.  select user_id from users where user_id not in (select user_id from user_extra_info);

Q4.  select user_id from user_extra_info;

Q5.  select user_id from users where user_id not in (select user_id from user_extra_info) and user_id in (select user_id from transactions);
