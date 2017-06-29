package io.vuekt.framework.vue.common

import io.vuekt.framework.vue.external.Object

/**
 * Created by gbaldeck on 6/22/2017.
 */
fun jsObjectOf(vararg pairs: Pair<String, dynamic>): Any{
  val obj: dynamic = Any()
  pairs.forEach {
    (key, value) ->
    obj[key] = value
  }
  return obj
}

fun jsObjectOf(map: Map<String, dynamic>): Any = jsObjectOf(*map.toList().toTypedArray())

fun Any._get(key: dynamic): dynamic {
  val self: dynamic = this
  return self[key]
}

fun Any._set(key: dynamic, value: dynamic){
  val self: dynamic = this
  self[key] = value
}

object ObjectHelper {
  fun <K, V> forEach(obj: dynamic, keyVal: (Pair<K, V>) -> Unit) {
    val keys = Object.keys(obj) as Array<K>
    keys.forEach {
      keyVal(Pair(it, obj[it]))
    }
  }
}

fun newObject(): dynamic = js("new Object()")

internal fun String.camelToDashCase(): String {
  return this.replace(Regex("([a-z])([A-Z])"), {
    result ->
    val (g1: String, g2: String) = result.destructured
    "$g1-$g2"
  })
}

fun isNullOrUndefined(value: dynamic): Boolean = value === undefined || value === null

fun isNotNullOrUndefined(value: dynamic): Boolean = !isNullOrUndefined(value)