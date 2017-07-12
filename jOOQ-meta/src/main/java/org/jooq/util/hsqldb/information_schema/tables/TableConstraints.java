/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.hsqldb.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.util.hsqldb.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 383796146;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.IS_DEFERRABLE</code>.
     */
    public final TableField<Record, String> IS_DEFERRABLE = createField("IS_DEFERRABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS.INITIALLY_DEFERRED</code>.
     */
    public final TableField<Record, String> INITIALLY_DEFERRED = createField("INITIALLY_DEFERRED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code> table reference
     */
    public TableConstraints() {
        this(DSL.name("TABLE_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code> table reference
     */
    public TableConstraints(String alias) {
        this(DSL.name(alias), TABLE_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code> table reference
     */
    public TableConstraints(Name alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    private TableConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraints as(Name alias) {
        return new TableConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(String name) {
        return new TableConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableConstraints rename(Name name) {
        return new TableConstraints(name, null);
    }
}
