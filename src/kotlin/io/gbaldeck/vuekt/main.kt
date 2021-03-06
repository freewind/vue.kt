package io.gbaldeck.vuekt

import io.gbaldeck.vuekt.wrapper.Vue

fun main(args: Array<String>) {

//  initToLowerCaseFilter()
//  initHighlightDirective()

  //just in case, always init components last
  //this is so that everything their template needs will be available when they are rendered
//  initSubComponent()
  Vue component SubComponentClassStyle()
  Vue component TestComponent()
  Vue directive HighlightDirective()
  Vue filter ToLowerCaseFilter()
//  initTestComponent()

//  Vue component ClassStyleComponent()
}
