/**
Defines a combine function for several instances of ValidatedNel[E, _]

Autogenerated using tools/codegen.sh
*/
package com.danielasfregola.datavalidation

import cats.Apply
import cats.data.ValidatedNel

trait CombineArities[E]{

  private type Validation[T] = ValidatedNel[E, T]

  /** Combine function for Validation[T] of arity 2 */
  def combine[T1,T2,Z](v1: Validation[T1],v2: Validation[T2])(f: (T1,T2) => Z): Validation[Z] =
    Apply[Validation].map2(v1,v2)(f)

  /** Combine function for Validation[T] of arity 3 */
  def combine[T1,T2,T3,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3])(f: (T1,T2,T3) => Z): Validation[Z] =
    Apply[Validation].map3(v1,v2,v3)(f)

  /** Combine function for Validation[T] of arity 4 */
  def combine[T1,T2,T3,T4,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4])(f: (T1,T2,T3,T4) => Z): Validation[Z] =
    Apply[Validation].map4(v1,v2,v3,v4)(f)

  /** Combine function for Validation[T] of arity 5 */
  def combine[T1,T2,T3,T4,T5,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5])(f: (T1,T2,T3,T4,T5) => Z): Validation[Z] =
    Apply[Validation].map5(v1,v2,v3,v4,v5)(f)

  /** Combine function for Validation[T] of arity 6 */
  def combine[T1,T2,T3,T4,T5,T6,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6])(f: (T1,T2,T3,T4,T5,T6) => Z): Validation[Z] =
    Apply[Validation].map6(v1,v2,v3,v4,v5,v6)(f)

  /** Combine function for Validation[T] of arity 7 */
  def combine[T1,T2,T3,T4,T5,T6,T7,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7])(f: (T1,T2,T3,T4,T5,T6,T7) => Z): Validation[Z] =
    Apply[Validation].map7(v1,v2,v3,v4,v5,v6,v7)(f)

  /** Combine function for Validation[T] of arity 8 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8])(f: (T1,T2,T3,T4,T5,T6,T7,T8) => Z): Validation[Z] =
    Apply[Validation].map8(v1,v2,v3,v4,v5,v6,v7,v8)(f)

  /** Combine function for Validation[T] of arity 9 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9) => Z): Validation[Z] =
    Apply[Validation].map9(v1,v2,v3,v4,v5,v6,v7,v8,v9)(f)

  /** Combine function for Validation[T] of arity 10 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) => Z): Validation[Z] =
    Apply[Validation].map10(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10)(f)

  /** Combine function for Validation[T] of arity 11 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) => Z): Validation[Z] =
    Apply[Validation].map11(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11)(f)

  /** Combine function for Validation[T] of arity 12 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) => Z): Validation[Z] =
    Apply[Validation].map12(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12)(f)

  /** Combine function for Validation[T] of arity 13 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) => Z): Validation[Z] =
    Apply[Validation].map13(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13)(f)

  /** Combine function for Validation[T] of arity 14 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) => Z): Validation[Z] =
    Apply[Validation].map14(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14)(f)

  /** Combine function for Validation[T] of arity 15 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) => Z): Validation[Z] =
    Apply[Validation].map15(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15)(f)

  /** Combine function for Validation[T] of arity 16 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) => Z): Validation[Z] =
    Apply[Validation].map16(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16)(f)

  /** Combine function for Validation[T] of arity 17 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) => Z): Validation[Z] =
    Apply[Validation].map17(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17)(f)

  /** Combine function for Validation[T] of arity 18 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17],v18: Validation[T18])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) => Z): Validation[Z] =
    Apply[Validation].map18(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18)(f)

  /** Combine function for Validation[T] of arity 19 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17],v18: Validation[T18],v19: Validation[T19])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) => Z): Validation[Z] =
    Apply[Validation].map19(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19)(f)

  /** Combine function for Validation[T] of arity 20 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17],v18: Validation[T18],v19: Validation[T19],v20: Validation[T20])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) => Z): Validation[Z] =
    Apply[Validation].map20(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20)(f)

  /** Combine function for Validation[T] of arity 21 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17],v18: Validation[T18],v19: Validation[T19],v20: Validation[T20],v21: Validation[T21])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) => Z): Validation[Z] =
    Apply[Validation].map21(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21)(f)

  /** Combine function for Validation[T] of arity 22 */
  def combine[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,Z](v1: Validation[T1],v2: Validation[T2],v3: Validation[T3],v4: Validation[T4],v5: Validation[T5],v6: Validation[T6],v7: Validation[T7],v8: Validation[T8],v9: Validation[T9],v10: Validation[T10],v11: Validation[T11],v12: Validation[T12],v13: Validation[T13],v14: Validation[T14],v15: Validation[T15],v16: Validation[T16],v17: Validation[T17],v18: Validation[T18],v19: Validation[T19],v20: Validation[T20],v21: Validation[T21],v22: Validation[T22])(f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) => Z): Validation[Z] =
    Apply[Validation].map22(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21,v22)(f)

}
 
