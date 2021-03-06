package com.github.shyiko.ktlint.ruleset.standard

import com.github.shyiko.ktlint.test.diffFileFormat
import com.github.shyiko.ktlint.test.diffFileLint
import org.assertj.core.api.Assertions.assertThat
import org.testng.annotations.Test

class NoUnitReturnRuleTest {

    @Test
    fun testLint() {
        assertThat(
            NoUnitReturnRule().diffFileLint(
                "spec/no-unit-return/lint.kt.spec"
            )
        ).isEmpty()
    }

    @Test
    fun testFormat() {
        assertThat(
            NoUnitReturnRule().diffFileFormat(
                "spec/no-unit-return/format.kt.spec",
                "spec/no-unit-return/format-expected.kt.spec"
            )
        ).isEmpty()
    }
}
