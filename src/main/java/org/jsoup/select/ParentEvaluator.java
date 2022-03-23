package org.jsoup.select;

public class ParentEvaluator extends abstractEvaluator {

    public ParentEvaluator() {
    }

      Evaluator getEvaluator(Evaluator currentEval, Evaluator newEval) {
        currentEval = new CombiningEvaluator.And(new StructuralEvaluator.Parent(currentEval), newEval);
        return currentEval;
    }
}