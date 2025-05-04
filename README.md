## Run liquibase commands with explicitly referring to the changelog path

mvn liquibase:history -Dliquibase.propertyFile=liquibase.properties

## Rollback

### by tag

mvn liquibase:rollback -Dliquibase.rollbackTag=v1.0 -Dliquibase.propertyFile=liquibase.properties

### by count (last N changesets)

mvn liquibase:rollback -Dliquibase.rollbackCount=1 -Dliquibase.propertyFile=liquibase.properties

### to specific date

mvn liquibase:rollback -Dliquibase.rollbackToDate=2025-05-01T10:00:00 -Dliquibase.propertyFile=liquibase.properties


