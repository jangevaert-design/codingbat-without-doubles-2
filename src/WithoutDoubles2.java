public class WithoutDoubles2 {
  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles && die1 == die2 && die1 < 6 && die2 < 6) {
      return die1 + die2 + 1;
    } else if (noDoubles && die1 == 6 && die2 == 6) {
      return die1 + 1;
    } else {
      return die1 + die2;
    }
  }

}

// more concise
//public int withoutDoubles(int die1, int die2, boolean noDoubles) {
//  if(noDoubles) {
//    if (die1 == die2) {
//      if (die1 != 6)
//      return die1 + 1 + die2;
//      else
//      return 1 + die2;
//    }
//  }
//  return die1 + die2;
//}
