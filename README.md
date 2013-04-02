gooddata-project-jdbc
=====================

A perhaps useless PoC - computing GoodData reports via JDBC interface.

Prerequisity - install GoodData-CL 1.2.68 into your local Maven repository (note: 1.2.67 is last version, pull request for 1.2.68 pending)

    cd ..
    git clone git://github.com/gooddata/GoodData-CL.git
    mvn install

Usage:

    GDC_USERNAME='your@gooddata.account' GDC_PASSWORD='******' mvn test

or

    mvn clean compile assembly:single

and point your SquirelSQL to the generated JAR file. Only report URI
accepted as a "query" - e.g.  "/gdc/md/la84vcyhrq8jwbu4wpipw66q2sqeb923/obj/4970"

(and yes, it's still buggy and incomplete)
