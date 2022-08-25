package org.acme.quickstart;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CamelCaseToPascalCaseConverter implements PhysicalNamingStrategy {

    @Override
    public Identifier toPhysicalCatalogName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return formatIdentifier(identifier);
    }

    @Override
    public Identifier toPhysicalColumnName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return formatIdentifier(identifier);
    }

    @Override
    public Identifier toPhysicalSchemaName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return formatIdentifier(identifier);
    }

    @Override
    public Identifier toPhysicalSequenceName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return formatIdentifier(identifier);
    }

    @Override
    public Identifier toPhysicalTableName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return formatIdentifier(identifier);
    }

    private Identifier formatIdentifier(final Identifier identifier) {
        if (identifier == null) {
            return identifier;
        }

        String name = identifier.getText(); 
        String newName = name.substring(0, 1).toUpperCase() + name.substring(1);
        return Identifier.toIdentifier(newName, identifier.isQuoted());
    }

}