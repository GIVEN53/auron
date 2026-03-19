# Codex Guidelines

This document provides guidelines for AI agents working on the auron repository.

## Project Structure

```
```

## Code Style

- Use descriptive names for classes, methods, and variables.
- Follow the [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html).

## Testing

- Add unit test for new features under `src/test/kotlin`.
- Name test files using `*Test.kt` convention and mirror production package paths.
- Use BDD syntax with given-when-then structured test.
- Use `kotest` framework, and `mockk` for mocking.
- Backtick test names (e.g., fun `my test`()) for readability.
- Test your changes by running `./gradlew test`.

Example:

```kotlin
class MyTest {
	private val myClass = MyClass()

	@Test
	fun `should be 4 when input is 2`() {
		val input = 2

		val actual = myClass.square(input)

		actual shouldBe 4
	}
}
```

## Security & Configuration

## Commit

- Use conventional commit messages (feat, fix, chore, docs, test, refactor).
- Keep commits focused; one logical change per commit.
- Use the imperative mood in commit messages (e.g., "feat: add feature" not "feat: added feature").

## Pull Request

- Use PR title prefix to indicate the type of PR (`feat: `|`fix: `|`chore: `).
    - **feat:** new feature under `src/main/kotlin`.
    - **fix:** bug fix, a non-breaking change affecting `src/main/kotlin` and/or `src/test/kotlin`.
    - **chore:** other changes
- Generate a summary as a change log entry targeting external consumers of this codebase in PR description.
- Run `./gradlew check` locally to ensure all tests pass before pushing your changes.
- Include test evidence in PR descriptions: Gradle task output, screenshots (if applicable).
