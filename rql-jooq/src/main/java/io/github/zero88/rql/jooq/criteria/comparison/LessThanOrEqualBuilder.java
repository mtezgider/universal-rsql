package io.github.zero88.rql.jooq.criteria.comparison;

import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;

import io.github.zero88.rql.jooq.JooqArgumentParser;
import io.github.zero88.rql.jooq.criteria.JooqComparisonCriteriaBuilder;

import cz.jirutka.rsql.parser.ast.ComparisonNode;
import cz.jirutka.rsql.parser.ast.ComparisonOperator;
import cz.jirutka.rsql.parser.ast.RSQLOperators;
import lombok.NonNull;

public final class LessThanOrEqualBuilder extends JooqComparisonCriteriaBuilder {

    public static final ComparisonOperator OPERATOR = RSQLOperators.LESS_THAN_OR_EQUAL;

    public LessThanOrEqualBuilder(@NonNull ComparisonNode node) {
        super(node);
    }

    @Override
    protected @NonNull Condition compare(@NonNull Field field, @NonNull List<String> arguments,
                                         @NonNull JooqArgumentParser parser) {
        return field.le(parser.parse(field, arguments.get(0)));
    }

}
