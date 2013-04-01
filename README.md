gooddata-project-jdbc
=====================

A perhaps useless PoC - computing GoodData reports via JDBC interface.

Prerequisity - install GoodData-CL 1.2.67 into your local Maven repository:

    cd ..
    git clone git://github.com/gooddata/GoodData-CL.git
    mvn install

Usage:

    GDC_USERNAME='your@gooddata.account' GDC_PASSWORD='******' mvn test

(and yes, it will fail now).
