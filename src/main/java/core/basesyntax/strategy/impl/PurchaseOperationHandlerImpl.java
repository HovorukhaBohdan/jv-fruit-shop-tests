package core.basesyntax.strategy.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationHandler;

public class PurchaseOperationHandlerImpl implements OperationHandler {
    @Override
    public int count(FruitTransaction fruitTransaction) {
        return -fruitTransaction.getQuantity();
    }
}