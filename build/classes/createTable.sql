--以下のＳｑｌコマンドをpostgresql バージョン1.18.1で作成する

create table yahooSearchResult( 
    id int primary key
    , keys varchar
    , img varchar
    , title varchar
    , price int
    , createTime timestamp
    , updateTime timestamp
); 
drop sequence yahooSearchResult_id_seq;
CREATE SEQUENCE yahooSearchResult_id_seq INCREMENT BY
    1 MAXVALUE 99999999 
START WITH
    1 NO CYCLE; 
  
create table yahooSearchResultNow( 
    id int primary key
    , keys varchar
    , img varchar
    , title varchar
    , price int
    , createTime timestamp
); 
 drop sequence yahooSearchResultNow_id_seq; 
CREATE SEQUENCE yahooSearchResultNow_id_seq INCREMENT BY
    1 MAXVALUE 99999999 
START WITH
    1 NO CYCLE; 